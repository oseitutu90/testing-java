public class Building {
    public static void main(String[] args) {
        System.out.println("get it right");
        Bedroom newRoom = Bedroom.builder().ceilingHeight(120).isDouble(true).numberOfDoors(12).build();
        System.out.println(newRoom.getCeilingHeight()
        );
    }
}
