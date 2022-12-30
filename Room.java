public class Room {
    int roomNumber;
    int participateSize;
    boolean isAvailable;

    public Room() {
        this.isAvailable = true;
    }

    public Room(int roomNumber, int participateSize) {
        this.roomNumber = roomNumber;
        this.participateSize = participateSize;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int getParticipateSize() {
        return participateSize;
    }
    public void setParticipateSize(int participateSize) {
        this.participateSize = participateSize;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
