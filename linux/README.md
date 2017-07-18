--linux

ls lista todo el contenido de una carpeta
pwd path o ruta donde me encuentro actualmente
cd .. devuelve una carpeta
cd [nombre carpeta] ingresa en una carpeta
mkdir [nombre carpeta] crea carpetas
rmdir [nombre carpeta] borra la carpeta
cd / me deja en la raiz del pc

top muestra todos los procesos de linux que se estan ejecutando 

--unix
--editor de texto VIM
modo insercion con la tecla i
modo comando con la tecla ESC

Salir del editor

:x
Sale del editor, salvando los cambios. Es decir, cualquier cambio que se haya efectuado en el documento, sera guardado en el disco antes de salir.
:q
Sale del editor, solo si no hubieron cambios en el mismo. En caso de haber cambios, se negará a salir, dando la oportunidad de guardar los cambios realizados. Esta es la forma más segura de salir, y debe ser la que nos acostumbremos a usar.
ZZ
Doble Z mayúscula, basta presionar Shift y dos veces la letra z, esto proboca que el el editor finalize y guarde los cambios que se hubieran realizado.
:q!
Igual que :q pero, en este caso, no guarda los cambios, ni alerta de los mismos. Util cuando hemos realizado cambios a un documento que no queremos conservar, peligroso acostumbrarse a usarlo siempre para salir, pues podemos perder los cambios realizados no habrá ningún tipo de alerta
:wq
Graba el archivo y sale del editor, a diferencia de :x, :wq, graba el archivo aún cuando no se hubieran realizado cambios al mismo