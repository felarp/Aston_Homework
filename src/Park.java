public class Park {
    class Attraction {
        private final String name, hours;
        private final double cost;

        public Attraction(String name, String hours, double cost) {
            this.name = name;
            this.hours = hours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.printf("Аттракцион: %s, Время работы: %s, Стоимость: %.2f%n",
                    name, hours, cost);
        }
    }


    public static void main(String[] args) {
        Park park = new Park();
        Attraction[] attractions = {
                park.new Attraction("Колесо обозрения", "10:00-20:00", 300),
                park.new Attraction("Американские горки", "11:00-21:00", 500),
                park.new Attraction("Комната страха", "12:00-22:00", 400)
        };

        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }
}
