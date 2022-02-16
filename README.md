# Mutant-Dna
MELI test, API Rest to identify mutant human

# Test de carga
Se utilizo Jmeter para realizar un test de carga en la webapi corriendo localmente, la configuracion fue de un threadgroup de 500 hilos corriendo en simultaneo. En el body se utilizo tanto un ejemplo de un DNA Mutante como un ejemplo de DNA NO Mutante, el porcentaje de error del 100% se debe a que por letra al no ser un DNA Mutante se debe devolver 403 por lo que Jmeter lo toma como error. 

Obtuvimos un rendimiento de casi 3800 respuestas por segundo, en una aplicacion con multiples procesos corriendo en simultaneo, se puede mejorar la misma.

![image](https://user-images.githubusercontent.com/54360142/154194836-e99b302e-e71e-4a05-a495-4892c426ea63.png)

El response Time se mantiene estable siempre por debajo de los 200 mSeg

![image](https://user-images.githubusercontent.com/54360142/154195089-07222576-64d9-4ba8-a5bc-1fb4bc97bf72.png)



