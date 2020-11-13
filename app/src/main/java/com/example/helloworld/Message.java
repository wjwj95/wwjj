package com.example.helloworld;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Message implements Parcelable {

    private  String userName;
    private  String gender;
    private  int age;



    public Message(String name,String gender,int age){
        this.userName = name;
        this.gender = gender;
        this.age = age;

    }

    @Override
    public int describeContents() {
        return 0;
    }

    public  Message(Parcel in){
        userName = in.readString();
        gender = in.readString();
        age = in .readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userName);
        dest.writeString(gender);
        dest.writeInt(age);

    }

    @NonNull
    @Override
    public String toString() {

        return "Message[username=" + userName +"gender" + gender + "age" + age +"]";
    }

    public Message() {
        super();
    }

    public static Parcelable.Creator<Message> CREATOR = new Parcelable.Creator<Message>() {
        @Override
        public Message createFromParcel(Parcel source) {
            return new Message(source);
        }

        @Override
        public Message[] newArray(int size) {
            return new Message[size];
        }

    };
}
