public class Country {
     private String name;
     private String language;
     private City city;
     private int HowManyPeopleAreThere;

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getLanguage() {
            return language;
      }

      public void setLanguage(String language) {
            this.language = language;
      }

    public int getHowManyPeopleAreThere() {
        return HowManyPeopleAreThere;
    }

    public void setHowManyPeopleAreThere(int howManyPeopleAreThere) {
        HowManyPeopleAreThere = howManyPeopleAreThere;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
