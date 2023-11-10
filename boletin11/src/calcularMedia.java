import java.util.Scanner;

public class calcularMedia {

    public void CalcularMedia() {

         int i=1;
         int j=1;
         float suma=0;

        do{
            Scanner sc= new Scanner(System.in);
            Alumno obx=new Alumno();
            i=1;
            System.out.println("Escriba o nome do alumno");
            obx.setNome(sc.nextLine());
            System.out.println("Escriba a nota "+ i);
            i++;
            obx.setNota1(sc.nextFloat());
            System.out.println("Escriba a nota "+ i);
            i++;
            obx.setNota2(sc.nextFloat());
            System.out.println("Escriba a nota "+ i);
            i++;
            obx.setNota3(sc.nextFloat());
            System.out.println("Escriba a nota "+ i);
            i++;
            obx.setNota4(sc.nextFloat());
            System.out.println("Escriba a nota "+ i);
            i++;
            obx.setNota5(sc.nextFloat());
            System.out.println("Escriba a nota "+ i);
            i++;
            obx.setNota6(sc.nextFloat());

            suma=(obx.getNota1()+obx.getNota2()+ obx.getNota3()+obx.getNota4()+obx.getNota5()+obx.getNota6());
            System.out.println("A media do alumno "+ obx.getNome() +" é igual a "+ suma/6 +"\n");
            j++;
        }while(j<4);

    }
}
