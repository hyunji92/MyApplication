package test.chunghj.myapplication;

/**
 * Created by chunghj on 15. 2. 17..
 */
public class TIndex {
    /** private start =0;

    if(start<0)

    {
        start = 0;
    }

    int subCount = subString.count;
    int _count = count;
    if(subCount>0)

    {
        if (subCount + start > _count) {
            return -1;
        }
        char[] target = subString.value;
        int subOffset = subString.offset;
        char firstChar = target[subOffset];
        int end = subOffset + subCount;
        while (true) {
            int i = indexOf(firstChar, start);
            if (i == -1 || subCount + i > _count) {
                return -1; // handles subCount > count || start >= count
            }
            int o1 = offset + i, o2 = subOffset;
            char[] _value = value;
            while (++o2 < end && _value[++o1] == target[o2]) {
                // Intentionally empty
            }
            if (o2 == end) {
                return i;
            }
            start = i + 1;
        }
    }

    return start<_count?start:_count; **/

}
