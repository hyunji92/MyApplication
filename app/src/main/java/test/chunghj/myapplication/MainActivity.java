package test.chunghj.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String test = "ab,cd,ef";
        String cut = ",";
        char ch = cut.charAt(0);

        // setSplit(test,cut);
        Split2(test, ch);
        //splitAndIndexof(test, ch);

    }

    public String[] setSplit(String test, String cut) {
        int i = 0;
        int str_count = 0;
        int index = 0;
        int last_index = 0;

        do {
            str_count++;
            index++;
            index = test.indexOf(cut, index);
        } while (index != -1);

        String[] splittext = new String[str_count];

        index = 0;

        while (i < str_count) {
            last_index = test.indexOf(cut, index);
            // buff 에 string 을 가져온 후 index부터(Stirng subString , int start)
            if (last_index == -1) {
                splittext[i] = test.substring(index).trim();
            } else {
                splittext[i] = test.substring(index, last_index).trim();
            }

            index = last_index + 1;
            i++;
        }
        Log.d("TTT", " SetSplit !!!!! : " + splittext[i]);
        return splittext;


    }

    String data = "ab,cd,ef";


    void Split(String data, char separator) {
        int nCount = 0;
        int nGetIndex = 0;

        //임시저장
        String mTemp = "";

        //원본 복사
        String mCopy = data;

        while (true) {
            //구분자 찾기
            nGetIndex = mCopy.indexOf(separator);

            //리턴된 인덱스가 있나?
            if (-1 != nGetIndex) {
                //있다.

                //데이터 넣고
                mTemp = mCopy.substring(0, nGetIndex);
                Log.d("TTT", "test mTemp 111!!! : " + mTemp);
                //뺀 데이터 만큼 잘라낸다.
                mCopy = mCopy.substring(nGetIndex + 1);
            } else {
                //없으면 마무리 한다.
                Log.d("TTT", "test mCopy 111!!! : " + mCopy);
                break;
            }

            //다음 문자로~
            ++nCount;
//            ++nGetIndex;
        }

    }

    void splitAndIndexof(String data, char separator) {
        int nCount = 0;
        int nGetIndex = 1;
        int i = 0;

        String[] s = new String[data.length()];

        //임시저장
        String mTemp = "";

        //원본 복사
        String mCopy = data;

        for (i = 0; i < data.length(); i++) {
            //여기서 검사해서 스트링수만 큼 하나씩 돌려본다.
            //밑에 if 가 함께돌려지겠지
            // "," 같지않다면 if에 걸리지않고 나간다.
            s[i] = new String(data);

            // s[i] = data;
            Log.d("TTT", "test s[1] >v<!!! : " + s[i]);
            if (s[i].equals(separator)) {

                StringBuffer sb = new StringBuffer();
                mTemp = mCopy.substring(0, nGetIndex);
                Log.d("TTT", "test mTemp 111!!! : " + mTemp);
                //뺀 데이터 만큼 잘라낸다.
                mCopy = mCopy.substring(nGetIndex + 1);
                // sb.append(mTemp);
            } else {
                if (-1 != nGetIndex) {
                    Log.d("TTT", "test mCopy 112!!! : " + mCopy);

                }
                //if에 걸리지 않고 나왔다면
                // 여기서 그냥 계속 더해주던거에 더한다.
                // 버퍼에 새로 넣는다 하나씩 검사 할때마다 넣는다.
                //데이터 넣고
            }

        }

    }

    void Split2(String data, char separator) {
        int i = 0;
        //임시저장
        String mTemp = "";

        //원본 복사
        String mCopy = data;

        for (i = 0; i < data.length(); i++) {
            for (int j = i; j < data.length(); j++) {
                //구분자 찾기
                String str_div = data.substring(i, j + 1); //문자열의 처음부터 차례대로 잘라나감.
                mTemp = str_div;

                if (str_div.equals(",")) {

                    StringBuffer presb = new StringBuffer();
                    presb.append(str_div);
                    Log.d("TTT", "presb   114!!! : @^  :  " + presb);


                } else {

                    StringBuffer sb = new StringBuffer();
                    String str_div1 = data.substring(i + 1, j + 2);
                    sb.append(mTemp);
                    sb.append(str_div1);
                    if (sb.length() == 2) {
                        Log.d("TTT", "test sb 112!!! : @0  :  " + sb);
                    }
                    break;
                }

            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * String test = "ab,cd,ef";
     Pattern p = Pattern.compile(",");
     for (int i =0 ; i<= test.length() ; i++) {
     Matcher m = p.matcher(test);
     if (m.find()){

     if (","equals())
     StringBuffer sb = new StringBuffer();

     }


     }**/
}
