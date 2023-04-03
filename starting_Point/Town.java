package starting_Point;

    public class Town {
        private String name;
        private double distanceFromTallinn;

        public Town(String name, double distanceFromTallinn) {
            this.name = name;
            this.distanceFromTallinn = distanceFromTallinn;
        }

        public String getName() {
            return name;
        }

        public double getDistanceFromTallinn() {
            return distanceFromTallinn;
        }
    }


