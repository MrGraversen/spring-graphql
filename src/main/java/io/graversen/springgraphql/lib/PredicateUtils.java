package io.graversen.springgraphql.lib;

import java.util.function.Predicate;

public class PredicateUtils
{
    public static <T> Predicate<T> safe(Object argument, Predicate<T> predicate)
    {
        if (argument != null)
        {
            return predicate;
        }
        else
        {
            return o -> true;
        }
    }
}
