import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Country country1 = new Country();
        country1.setName("Kyrgyzstan");
        country1.setLanguage("Kyrgyz");
        country1.setHowManyPeopleAreThere(70000000);

        Country country2 = new Country();
        country2.setName("Kazakstan");
        country2.setLanguage("Kazaksha");
        country2.setHowManyPeopleAreThere(89000000);

        Country country3 = new Country();
        country3.setName("Passia");
        country3.setLanguage("Ruski");
        country3.setHowManyPeopleAreThere(99000000);

        Country country4 = new Country();
        country4.setName("Amerika");
        country4.setLanguage("English");
        country4.setHowManyPeopleAreThere(999999999);


        City city1 = new City();
        city1.setName("Bishkek");

        City city2 = new City();
        city2.setName("Almaty");

        City city3 = new City();
        city3.setName("Maskva");

        City city4 = new City();
        city4.setName("Chikago");


        Address address1 = new Address();
        address1.setAddres("Ak-ordo 29");

        Address address2 = new Address();
        address2.setAddres("Medeu 123");

        Address address3 = new Address();
        address3.setAddres("Taganka 2");

        Address address4 = new Address();
        address4.setAddres("13 raion");


        Person person1 = new Person();
        person1.setSurname("Nuridinov");
        person1.setName("Kairat");
        person1.setAge(18);

        Person person2 = new Person();
        person2.setSurname("Asanbekov ");
        person2.setName("Ernazar");
        person2.setAge(19);

        Person person3 = new Person();
        person3.setSurname("Turgunbaiev");
        person3.setName("Eldan");
        person3.setAge(17);


        Person person4 = new Person();
        person4.setSurname("Nuridinov");
        person4.setName("Kairat");
        person4.setAge(18);


        Country[] countries = {country1, country2, country3, country4};
        System.out.println("<<<<<<<<<<<< Country >>>>>>>>>>>>>>\n");
        for (Country d : countries) {
            System.out.println("Name : " + d.getName());
            System.out.println("Language : " + d.getLanguage());
            System.out.println("HowManyPeopleAreThere : " + d.getHowManyPeopleAreThere());
            System.out.println();


        }
        City[] cities = {city1, city2, city3, city4};
        System.out.println("<<<<<<<<<<<<<< City >>>>>>>>>>>>>>>>>>>>>>\n");
        for (City f : cities) {
            System.out.println("Name : " + f.getName());
            System.out.println();
        }

        Address[] addresses = {address1, address2, address3, address4};
        System.out.println("<<<<<<<<<<<<<<<< Address >>>>>>>>>>>>>>>>\n");
        for (Address d : addresses) {

            System.out.println("Address : " + d.getAddres());
            System.out.println();
        }
        Person[] persons = {person1, person2, person3, person4};
        System.out.println("<<<<<<<<<<<<<<<< Person >>>>>>>>>>>>>>>>>> \n");
        for (Person s : persons) {
            System.out.println("Surname : " + s.getSurname());
            System.out.println("Name : " + s.getName());
            System.out.println("Age : " + s.getAge());
            System.out.println();
        }
    }
}