package com.github.sejoung.codetest.object;

public class RoomTest {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)) {
            System.out.println("안녕~");
        }

        new Room(99);
        System.gc();
        System.out.println("안되~");
    }
}
