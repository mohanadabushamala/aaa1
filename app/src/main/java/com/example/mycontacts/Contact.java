package com.example.mycontacts;

import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable {

    private String na;

    private String phoneN;

    private String addrs;


    public Contact() {

    }

    public Contact(String name, String phoneNum, String address) {
        this.na = name;
        this.phoneN = phoneNum;
        this.addrs = address;
    }

    protected Contact(Parcel in) {
        na = in.readString();
        phoneN = in.readString();
        addrs = in.readString();
    }


    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }


        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    public String getName() {
        return na;
    }

    public void setName(String name) {
        this.na = name;
    }

    public String getPhoneNum() {
        return phoneN;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneN = phoneNum;
    }

    public String getAddress() {
        return addrs;
    }

    public void setAddress(String address) {
        this.addrs = address;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(na);
        dest.writeString(phoneN);
        dest.writeString(addrs);
    }
}
