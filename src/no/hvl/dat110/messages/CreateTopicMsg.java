package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	
	// TODO: 
	// Implement object variables - a topic is required
	private String topic;

public CreateTopicMsg(String user, String topic) {
		super(MessageType.CREATETOPIC, user);
		this.topic = topic;
}

// Constructor, get/set-methods, and toString method
// as described in the project text	
public String getTopic() {
	return topic;
}

public void setTopic(String topic) {
	this.topic = topic;
}

@Override
public String toString() {
	return "Topic: " + topic + " " + super.toString();
};
	

}