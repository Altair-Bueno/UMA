---
marp: true
theme: default
class: invert
paginate: true
---

# Servicios de CI/CD

---

# Circle CI

---

<!--
Cuando inicias sesión o te registras utilizando GiHub o BitBucket, esta es la
pestaña principal que se presenta. Puedes ver todos los repositorios de la
organización y gestionar sus runners
-->

![bg](resources/2022-04-19-19-38-27.png)

---

![bg right fit](resources/2022-04-19-19-40-44.png)

- **Fastest**: Utiliza un fichero ya existente en el repo
- **Faster**: Crea una rama `circleci-project-setup` con un fichero
  `.circleci/config.yml`
- **Fast**: Te permite configurar el fichero `.circleci/config.yml` de forma
  similar a GitHub Actions

---

![bg](resources/2022-04-19-20-00-13.png)

---

![bg](resources/2022-04-19-20-03-04.png)

---

![bg](resources/2022-04-19-20-05-13.png)

---

## `config.yml`

Fichero YAML ubicado en la carpeta `.circleci` en cualquier rama del
repositorio. Podemos editarlo manualmente desde nuestro editor de código
favorito o desde la web

---

![bg](resources/2022-04-19-20-11-26.png)

---

<!--
_color: white
_backgroundColor: #222
_class: []
-->

### Estructura

```yaml
version: 2.1
# Orbs requeridos
orbs:
  node: circleci/node@4.7.0
jobs:
  build:
    # Entorno de ejecución (`docker`, `machine`, `macos` or `executor`)
    executor:
      name: node/default
      tag: "10.4"
    # Etapas que componen el trabajo
    steps:
      - checkout
      - node/with-cache:
          steps:
            - run: npm install
      - run: npm run test
```

---

# Orbs

- Utilidades por la comunidad o por Circle CI
- Funcionan como **módulos**
- Se importan y se exportan
- Simplifican enormemente el desarrollo de workflows multiplataforma

---

<!--
_color: white
_backgroundColor: #222
_class: []
_footer: 'Fuente: https://circleci.com/developer/orbs/orb/circleci/rust#commands-build'
-->

```yaml
version: "2.1"
orbs:
  # Orb de Rust (aka. `from circleci import rust@x.y.z as rust `)
  rust: circleci/rust@x.y.z
workflows:
  # Definimos los distintos workflows disponibles (aka. `production.py`)
  production:
    jobs:
      # Ejecutamos la función `build` dentro del orb definido
      # anteriormente (aka. `rust.build(release=True)`)
      - rust/build:
          release: true
```

---

# Jobs

- Funciones a llamar para ser ejecutadas
- Cada job puede ser en un entorno distinto
- Pueden definirse globalmente para todos los workflows o para un workflow
  concreto

---

<!--
_color: white
_backgroundColor: #222
_class: []
-->

```yaml
version: 2
jobs: # we now have TWO jobs, so that a workflow can coordinate them!
  # aka. `def hello-world():`
  hello-world: # This is our first job.
    docker: # it uses the docker executor
      - image: cimg/ruby:2.6.8 # specifically, a docker image with ruby 2.6.8
        auth:
          username: mydockerhub-user
          password: $DOCKERHUB_PASSWORD # context / project UI env-var reference
    # Steps are a list of commands to run inside the docker container above.
    steps:
      - checkout # this pulls code down from GitHub
      # aka. `hello-world()`
      - run: echo "A first hello" # This prints "A first hello" to stdout.
workflows:
  version: 2
  one_and_two: # this is the name of our workflow
    jobs: # and here we list the jobs we are going to run.
      - hello-world
```

---

# Demo

Link: [Altair-Bueno/paintr](https://github.com/Altair-Bueno/paintr)

---

<!--
_color: white
_backgroundColor: #222
_class: []
-->

```yml
version: 2.1
executors:
  rust-executor:
    docker:
      - image: cimg/rust:1.60.0
jobs:
  test-kahlo:
    executor: rust-executor
    steps:
      - checkout
      - restore_cache:
          key: kahlo-rust-cache-{{ checksum "kahlo/Cargo.lock" }}
      - run: |
          cd ./kahlo
          cargo test
      - save_cache:
          key: kahlo-rust-cache-{{ checksum "kahlo/Cargo.lock" }}
          paths:
            - "~/.cargo"
            - "./kahlo/target"
orbs:
  node: circleci/node@5.0.2
workflows:
  test:
    jobs:
      - test-kahlo
      - node/run:
          app-dir: "./dali"
          npm-run: "test"
```

---

# Planes y precios

<!--
_footer: Fuente: https://circleci.com/pricing/
-->

---

![bg](resources/2022-04-19-20-27-02.png)

---

|             | Hardware\*  | Creditos | Usuarios    | Precio     | Público objetivo           |
| ----------- | ----------- | -------- | ----------- | ---------- | -------------------------- |
| Free \*\*   | VMs         | 30.000   | 1           | Gratis     | Desarrolladores            |
| Performance | VMs + macOS | 55.000   | 5 gratuitos | Desde \$15 | Pequeñas empresas          |
| Scale       | Todo        | Custom   | Custom      | \$2.000    | Pequeñas/medianas empresas |
| Server      | Todo        | Custom   | Custom      | Custom     | Grandes empresas           |

> \* Docker, VMs (linux, windows, macOS, ARM linux), baremetal macOS, NVIDIA GPU
> cluster (versiones linux y windows)
>
> \*\* Proyectos OSS tienen más créditos

---

# Créditos

### Moneda digital de Circle CI utilizado para pagar, en tiempo real, por los servicios utilizados

---

## Servicios que consumen creditos

- Cada runner tiene un precio de **créditos/minuto** (warm-up time no cuenta)
- **Número de usuarios activos/mes**
- **Red y almacenamiento**: Direcciones IP, paquetes de red y almacenamiento que
  excedan la cuota
- **Miscelanea**: Las funciones extra también se pagan mediante créditos

## Importante!!

- Los créditos que pertenecen a tu plan que no gastes desaparecerán al mes
  siguiente
- Si tus créditos bajan del 2%, Circle CI automáticamente renovará un 25% de
  ellos
- Si cancelas tu cuenta, no recuperas el dinero. D:

---

# Puntos fuertes

- Permite configurar runners concurrentes de forma sencilla
- Amplio abanico de ofertas hardware. Especialmente interesante el soporte para
  **gráficas NVIDIA** tanto en windows como linux
- Soporte de primer grado para contenedores de **Docker**
- El plan gratuito no requiere tarjeta de crédito
- Acceso a los workflows mediante ssh tras su finalización
- Todos los jobs se ejecutan en paralelo
- Los jobs no se ejecutan si los ficheros no se han cambiado

---

# Conclusión

- **Circle CI**: Desarrollo multiplataforma, GPU computing o con alta
  dependencia en Dockers
