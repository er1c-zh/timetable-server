package cn.ek1o.timetable.server.util.ajax;

public class Response<T> {
    private int sc;
    private String msg;
    private T data;

    @Override
    public String toString() {
        return "Response{" +
                "sc=" + sc +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getSc() {
        return sc;
    }

    public void setSc(int sc) {
        this.sc = sc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
