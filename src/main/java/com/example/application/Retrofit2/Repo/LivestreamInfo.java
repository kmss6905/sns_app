package com.example.application.Retrofit2.Repo;

public class LivestreamInfo {
    String nick_name;
    String live_stream_url;
    String live_stream_title;
    String live_stream_tag;

    public String getNick_name() {
        return nick_name;
    }

    public String getLive_stream_url() {
        return live_stream_url;
    }

    public String getLive_stream_title() {
        return live_stream_title;
    }

    public String getLive_stream_tag() {
        return live_stream_tag;
    }

    @Override
    public String toString() {
        return "LivestreamInfo{" +
                "nick_name='" + nick_name + '\'' +
                ", live_stream_url='" + live_stream_url + '\'' +
                ", live_stream_title='" + live_stream_title + '\'' +
                ", live_stream_tag='" + live_stream_tag + '\'' +
                '}';
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public void setLive_stream_url(String live_stream_url) {
        this.live_stream_url = live_stream_url;
    }

    public void setLive_stream_title(String live_stream_title) {
        this.live_stream_title = live_stream_title;
    }

    public void setLive_stream_tag(String live_stream_tag) {
        this.live_stream_tag = live_stream_tag;
    }
}
