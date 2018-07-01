package hao.game2048.dto;

/**
 * Create by hao
 * 2018/7/1
 */
public class Message {
    private MessageEnum me;

    public Message(MessageEnum me) {
        this.me = me;
    }

    public MessageEnum getMe() {
        return me;
    }

    public void setMe(MessageEnum me) {
        this.me = me;
    }
}
