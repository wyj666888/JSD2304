package homework.day06;

import java.io.Serializable;

public class User implements Serializable {
        String name;
        String pwd;
        String nick;
        int age;

        public User(String name, String pwd, String nick, int age) {
            this.name = name;
            this.pwd = pwd;
            this.nick = nick;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Test01{" +
                    "name='" + name + '\'' +
                    ", pwd='" + pwd + '\'' +
                    ", nick='" + nick + '\'' +
                    ", age=" + age +
                    '}';
        }
}

