package Day13;

public class Session {
	String topic;
    String duration;
    String trainer;
    String room;

    Session(String topic, String duration, String trainer, String room) {
        this.topic = topic;
        this.duration = duration;
        this.trainer = trainer;
        this.room = room;
    }

    Session(String topic, String duration) {
        this(topic, duration, "Mahendra Yadav", "Lab 3");
    }

    void display() {
        System.out.println("SESSION DETAILS");
        System.out.println("Topic: " + topic);
        System.out.println("Duration: " + duration);
        System.out.println("Trainer: " + trainer);
        System.out.println("Room: " + room);
    }
}
