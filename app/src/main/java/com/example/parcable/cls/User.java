package com.example.parcable.cls;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class User implements Parcelable {

    private String name;
    private int age;

    public static final Parcelable.Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            String name = source.readString();
            int age = source.readInt();
            return new User(name, age);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
    private Parcel parcel;
    private int i;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

  //  @Override
  //  public void writeToParcel(@NonNull Parcel parcel, int i) {
  //      this.parcel = parcel;
  //      this.i = i;
  //  }

    @Override
   public void writeToParcel(Parcel dest, int flags) {
       dest.writeString(name);
       dest.writeInt(age);
   }
}