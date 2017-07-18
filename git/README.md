# Sistemas de control de versiones
# GIT

Configuración del git
-- global
git config --global --list

--configurar el usuario global 
git config --global user.name "John Doe"
--configurar el correo global
git config --global user.email johndoe@example.com

-- incializar un repositorio
git init

-- ver el estado del repositorio
git status

-- commit 
git commit
git commit -m "mensaje del commit"

-- consultar los commits
git log
gi log --stat


-- cambiar archivos a estado modified a stage
git add [nombre archivo]