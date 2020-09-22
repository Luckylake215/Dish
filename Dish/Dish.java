package Dish;
    public abstract class Dish {

        private String material;
        private String color;

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public abstract void material();

        public abstract void color();
    }