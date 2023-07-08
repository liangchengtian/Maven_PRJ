package com.fiveset.test;

import com.fiveset.animal.ChineseDog;
import com.fiveset.animal.Husky;
import com.fiveset.inter_face.PingPang;
import org.junit.Test;

public class AllTest {
    @Test
    public void test() {
        Husky h = new Husky();
        h.eat();
        h.drink();

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.lookHome();

        PingPang pp = new PingPang("乒乓球运动员",23);
        System.out.println(pp.getName());
        pp.eat();
    }
}
