public class Human {
    private String skinColor;
    Human(String skinColor){
        this.skinColor = skinColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    static class Hand{
        private int finger;
        Hand(int finger){
            this.finger = finger;
        }
        public int getFinger() {
            return finger;
        }
        public void setFinger(int finger) {
            this.finger = finger;
        }
    }
    static class Head{
        private String hairColor;
        Head(String hairColor){
            this.hairColor = hairColor;
        }
        public String getHairColor() {
            return hairColor;
        }
        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }
    }
    static class Leg{
        private int legSize;
        Leg(int legSize){
            this.legSize = legSize;
        }
        public void setLegSize(int legSize) {
            this.legSize = legSize;
        }
        public int getLegSize() {
            return legSize;
        }
    }
}
