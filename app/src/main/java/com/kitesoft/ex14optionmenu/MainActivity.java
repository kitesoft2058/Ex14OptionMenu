package com.kitesoft.ex14optionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //onCreate()메소드가 실행된 후
    //자동으로 OptionMenu를 만드는 작업을 하는
    //이 콜백메소드가 발동
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //매개변수로 전달된 Menu객체에게 MenuItem(메뉴항목)을 추가[ 2가지 방법 ]

        // 방법1. 자바언어로 메뉴아이템 추가..(잘 사용하지 않음)
        //menu.add( 0, 1, 0, "aaa" );
        //menu.add( 0, 2, 0, "bbb");


        // 방법 2. XML언어로 메뉴항목들을 설계하고
        //자바언어의 MenuItem객체로 만들어서(부풀리다inflate)
        //Menu에 추가하는 방법을 사용함.

        // res폴더>>menu폴더 생성 [ res폴더에서 마우스오른쪽버튼 메뉴에서 'Android Resource Directory' 선택 후 위에서 2번째 항목의 'Resource Type'에서 'menu'선택하면 menu폴더 추가됨]
        //menu폴더에 있는 actionbar_main.xml문서를 읽어와서
        //Menu객체로 만들어주는(부풀려주는inflate) 객체를 얻어오기
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.actionbar_main, menu);


        //* 오버플로우 메뉴들은 기본적으로 아이콘이 보이지 않도록 되어 있지만 코드를 통해 줄수는 있음.- 꼭 필요하지 않음.
//        if( menu instanceof MenuBuilder){
//            MenuBuilder m= (MenuBuilder)menu;
//            m.setOptionalIconsVisible(true);
//        }

        return super.onCreateOptionsMenu(menu);
    }

    //OptionMenu의 메뉴항목(MenuItem)을 선택했을때
    //자동으로 실행되는 콜백메소드
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id= item.getItemId();

        switch ( id ){

            case R.id.menu_search:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_add:
                Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_helf:
                Toast.makeText(this, "Helf", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
