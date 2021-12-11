import java.util.Scanner;

public class eleitor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int Idade, obrigatorio=0, facultativo=0, naoeleitor=0 ;
        String resp;

        do {
            System.out.print("Qual idade do Morador? ");
            Idade = teclado.nextInt();

            if (Idade < 16)
                naoeleitor = naoeleitor+1;
                           

                if (Idade >=18 && Idade <=69) 
                obrigatorio = obrigatorio+1;
                         
                if (Idade == 16 || Idade == 17 || Idade>= 70) 
                facultativo = facultativo+1;
              
                System.out.print("Quer continuar? [S/N] ");
                resp = teclado.next();
                
        }
        while (resp.equals("S"));
        
        System.out.println("Quantidade de eleitores obrigatorios: " + obrigatorio);
        System.out.println("Quantidade de eleitores facultativos: " + facultativo);
        System.out.println("Quantidade considerado não eleitor: " + naoeleitor);
        
        teclado.close();
    }
}
