package com.myproject.corejava.java8.predicate;

import com.myproject.corejava.java8.functionalinterface.FIMultiParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTestDemo {

    public static void main(String args[]) {

         // sc1
        Predicate<Integer> p = i->i>20;
        System.out.println(p.test(10));
        System.out.println(p.test(30));

        //sc2
        Predicate<String> str = s->s.length()>5;
        System.out.println(str.test("ganitha"));

        //sc3

        Predicate<Collection> c= list->list.isEmpty();
        List<String> list = new ArrayList<>();
        list.add("ganitha");
        System.out.println(c.test(list));

    }
}
