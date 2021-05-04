public class Ascensor {

    private int ultimo_piso=1;

    public void control(int x)throws Exception{

        int a = llamada();
        System.out.println("El ascensor se encuentra en el piso; "+a);
        int persona = crearPersona();
        System.out.println("la persona se encuentra en el piso; "+persona);
        elejirpiso(x,persona);

    }
    public int llamada(){
        return ultimo_piso;
    }

    public int crearPersona(){
        int persona = (int) Math.floor(Math.random()*3+1);
        //int persona = 3; // para hacer correr el test "eljirUnPisoQueSeaElMismoEnDondeSeEncuentra" quitar comentario a esta linea y volver comentario a ka linea de arriba.
        return persona;

    }
    private void elejirpiso(int destino, int inicio)throws Exception{
        if(destino>=4 || destino<=0){
            throw new Exception(destino+" esta fuera del rango de pisos del edificio");
        }
        else if(destino == inicio){
            throw new Exception(" debe elejir otro piso que no sea en el que se encuentra");
        }
        else if(inicio>ultimo_piso){
            if(inicio>destino){
                System.out.println("El ascensor sube hasta el piso "+inicio+" donde se encuentra la persona");
                System.out.println("El asensor baja hasta el piso "+destino+" el piso que la persona elijio");
                ultimo_piso=destino;

            }
            else if(inicio<destino){
                System.out.println("El ascensor sube hasta el piso "+inicio+" donde se encuentra la persona");
                System.out.println("El asensor sube hasta el piso "+destino+", el piso que la persona elijio");
                ultimo_piso=destino;

            }
        }
        else if(inicio == ultimo_piso){
            if(inicio>destino){

                System.out.println("El asensor baja hasta el piso "+destino+" el piso que la persona elijio");
                ultimo_piso=destino;

            }
            else if(inicio<destino){

                System.out.println("El asensor sube hasta el piso "+destino+", el piso que la persona elijio");
                ultimo_piso=destino;

            }
        }
        else if(inicio<ultimo_piso){
            if(inicio>destino){
                System.out.println("El ascensor baja hasta el piso "+inicio+" donde se encuentra la persona");
                System.out.println("El asensor baja hasta el piso "+destino+" el piso que la persona elijio");
                ultimo_piso=destino;

            }
            else if(inicio<destino){
                System.out.println("El ascensor baja hasta el piso "+inicio+" donde se encuentra la persona");
                System.out.println("El asensor sube hasta el piso "+destino+", el piso que la persona elijio");
                ultimo_piso=destino;

            }
        }



    }
}
