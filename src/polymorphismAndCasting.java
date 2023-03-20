class polymorphismAndCasting {
    public static void main(String[] args) {
        car c = null;

        /*다형성(polymorphism)
         * 1. 자손클래스의 인스턴스를 조상클래스가 사용할 수 있다.
         * 2. 자손클래스에서 생성된 멤버는 사용 불가능하다.
         * 3. 공통된 멤버 사용가능하다.*/
        car c1 = new FireEngine();

        //------에러--------
        /*FireEngine f = new car();*/

        /*참조 변수 형변환(Casting)
         * 1. Upcasting은 자손의 참조 변수가 조상의 참조변수에 할당 되는 것이다.
         * 2. Downcasting은 조상의 참조 변수가 자손의 참조변수에 할당 되는 것이다.
         * 3. ex) 조상참조변수 a = 자손참조변수 b ==> Upcasting
         *        자손참조변수 b = 조상참조변수 a ==> Downcasting
         * 참조변수 자손형변환에선 자손참조변수의 형을 생략할 수 있다.
         * 왜냐하면 자손클래스의 멤버들은 이미 조상 멤버에 있다.
         * 그래서 조상형변환에선 조상참조변수의 자로형을 꼭 써줘야한다.*/

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        c1 = fe;    //Upcasting이어서 생략 가능
        /*
        c1.water();     에러*/
        fe2 = (FireEngine)c1;   //Downcasting이어서 생략 불가.
        fe2.water();
    }
}

class car {
    String color;
    int door;

    void drive()    {       //운전 기능
        System.out.println("drive, Brrr~~");
    }
    void stop()     {       //정지 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends car    {
    void water()    {       //워셔 기능
        System.out.println("SHUUU~~~");
    }
}
