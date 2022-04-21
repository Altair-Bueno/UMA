# Primera parte: Configuración de un proyecto de Circle CI

> Nada importante que comentar. Ir mencionando las siguientes partes del proceso de configuración


# Fichero `config.yml`

- El editor web está basado en Visual Studio Code
- Tiene un wizzard que permite configurar servicios sin conocimiento de yml
- Linter que comprueba la validez del fichero de configuración
- Diferencias entre jobs y workflos:
  - Jobs se ejecutan secuencialmente
  - Los jobs están compuestos por ejecutores y pasos
  - Los workflows están compuestos de jobs
  - Los workflows ejecutan los jobs de forma paralela
- Los jobs son pequeños fragmentos reutilizables. Cuantas veces tenemos que compilar?? `nvm compile package suffire....`

# Orbs

Son como módulos de python (hacer el simil)


