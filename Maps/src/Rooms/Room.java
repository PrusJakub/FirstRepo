package Rooms;

import java.util.HashMap;
import java.util.Map;

public class Room {
    Map<Integer, String> rooms = new HashMap<>();
    int firstFreeRoom(){

        boolean isRoomBusy = true;
        int roomNumber = 1;
        while(isRoomBusy){
            isRoomBusy = rooms.containsKey(roomNumber);
            if(isRoomBusy)
                roomNumber++;
        }

        System.out.println("Pierwszy wolny pokoj ma numer " + roomNumber);
        return roomNumber;
    }
}
