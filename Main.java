import java.util.Scanner; 
class Main {
  public static void main(String[] args)
  {
    Scanner Obj = new Scanner(System.in); 
    String s;
    System.out.println("Wpisz tekst: ");
    s = Obj.nextLine();
    char[] tekst = s.toCharArray();
    char tab[] = new char[100];

    for (int i = 0; i < tekst.length; i++)
      {
        if (tekst[i] == 32) tekst[i] = 95;
        tab[i] = tekst[i];
        System.out.print(tab[i]);
      }
  }
}