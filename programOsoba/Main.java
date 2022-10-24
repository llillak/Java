package pl.zadanko;
import java.util.*;


public class Main {
    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        int liczba=0;

        List<Person> lista = new ArrayList<Person> ();
        Person osoba;

        int id;
        String nazwisko;
        String imie;
        int wiek;

        /*Person e=new Person ("Naciejek", "Kasia", 8);
        Person b=new Person ("Maciejek", "Kasia", 4);
        Person c=new Person ("Naciejek", "Lasia", 1);
        Person d=new Person ("Naciejek", "Kasia", 5);
        lista.add(e);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        */
        while(true){
            System.out.println("  ");
            System.out.println("1. dodaj osobe");
            System.out.println("2. usun osobe");
            System.out.println("3. wypisz osoby");
            System.out.println("4. sortuj po nazwisku");
            System.out.println("5. sortuj po nazwisku i imieniu");
            System.out.println("6. sortuj po nazwisku i imieniu i wieku");
            System.out.println("7. wyjdz");

            liczba=scanner.nextInt();


            if(liczba==0) {
                System.out.println("NIE WYBRANO OPCJI");

            }
            if (liczba == 1) {
                System.out.println("DODAWANIE OSOBY");
                System.out.println("Podaj nazwisko osoby");
                nazwisko= scanner.next();
                System.out.println("Podaj imie osoby");
                imie= scanner.next();
                System.out.println("Podaj wiek osoby");
                wiek= scanner.nextInt();
                Person a=new Person (nazwisko, imie, wiek);
                lista.add(a);

            }
            else if (liczba == 2) {
                System.out.println("USUWANIE OSOBY");
                System.out.println("Podaj numer osoby do usuniecia");
                id=scanner.nextInt();
                lista.remove(id-1);

            }
            else if (liczba == 3) {
                int ilosc=0;
                System.out.println("WYPISYWANIE OSOB");
                for(Person a:lista){
                    System.out.println(lista.get(ilosc));
                    ilosc++;
                }
            }
            else if (liczba == 4) {
                System.out.println("SORTOWANIE PO NAZWISKU");
                lista.sort((Comparator<? super Person>) new Comparator<Person>() {
                    @Override
                   public int compare(Person a, Person z) {
                        return a.surname.compareTo(z.surname);
                    }
                });
            }

            else if (liczba == 5) {
                System.out.println("SORTOWANIE PO NAZWISKU I IMIENIU");

                lista.sort((Comparator<? super Person>) new Comparator<Person>() {
                    @Override
                    public int compare(Person a, Person z) {
                        if(a.surname==z.surname){
                            return a.name.compareTo(z.name);
                        }
                        else {
                            return a.surname.compareTo(z.surname);
                        }
                    }
                });

            }
            else if (liczba == 6) {
                System.out.println("SORTOWANIE PO NAZWISKU I IMIENIU I WIEKU");

                lista.sort((Comparator<? super Person>) new Comparator<Person>() {
                    @Override
                    public int compare(Person a, Person z) {
                        if(a.surname==z.surname){
                            if(a.name==z.name){
                                if(a.age<z.age){
                                    return -1;

                                }
                                else if(a.age>z.age){
                                    return 1;

                                }
                                else if(a.age==z.age){
                                    return 0;

                                }
                                else return 0;
                            }
                            else {
                                return a.name.compareTo(z.name);
                            }
                        }
                        else {
                            return a.surname.compareTo(z.surname);
                        }
                    }
                });
            }
            else if (liczba == 7){
                System.out.println("WYSZEDLES Z PROGRAMU");
            break;
            }

            else
                System.out.println("BLEDNY NUMER");

        }

    }
}

