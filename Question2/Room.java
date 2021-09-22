package Question2;
import java.util.Scanner;

public class Room {
    private int roomNo;
    private String roomType;
    private float roomArea;
    private boolean acMachine;

    public void setRoomNo(int roomNo){
        this.roomNo = roomNo;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public void setRoomArea(float roomArea){
        this.roomArea = roomArea;
    }

    public void setAcMachine(boolean acMachine){
        this.acMachine = acMachine;
    }

    public int getRoomNo(){
        return roomNo;
    }

    public String getRoomType(){
        return roomType;
    }

    public float getRoomArea(){
        return roomArea;
    }

    public boolean getAcMachine(){
        return acMachine;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Room room = new Room();
        //set room details
        System.out.println("Enter Room No: ");
        room.setRoomNo(sc.nextInt());
        System.out.println("Enter Room Type: ");
        room.setRoomType(sc.next());
        System.out.println("Enter Room Area: ");
        room.setRoomArea(sc.nextFloat());
        System.out.println("Is AC available?? 'true or false' : ");
        room.setAcMachine(sc.nextBoolean());
        //get room details
        System.out.println("Your Room No. is: "+room.getRoomNo()+" and the room category is: "+room.getRoomType()+
                " which has area of: "+room.getRoomArea()+" Meter. The AC facility for a room is: "+room.getAcMachine());
    }
}
