package org.techtown.k_collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 값으로 컬렉션 생성하기
        var mutableList = mutableListOf("MON", "TUE", "WED")
        // 값을 추가한다.
        mutableList.add("TUE")
        // 값을 꺼낸다.
        Log.d("Collection", "mutableList의 첫 번쨰 값은 ${mutableList.get(0)}입니다.")
        Log.d("Collection", "mutableList의 두 번쨰 값은 ${mutableList.get(1)}입니다.")

        // 2. 빈 컬렉션 생성하기
        var stringList = mutableListOf<String>()
        // 값을 추가한ㄷ,
        stringList.add("월")
        stringList.add("화")
        stringList.add("수")
        // 값을 변경한다
        stringList.set(1, "요일 변경")
        // 사용
        Log.d("Collection", "stringList의 입력된 두 번쨰 값은 ${stringList.get(1)}입니다.")
        // 삭제
        stringList.removeAt(1)
        Log.d("Collection", "stringList의 입력된 두 번쨰 값은 ${stringList.get(1)}입니다.")
        // 개수 출력
        Log.d("Collection", "stringList에는 ${stringList.size}개의 값이 있습니다.")


        // 1. 셋 생성하고 값 추가하기
        var set = mutableSetOf<String>()
        set = mutableSetOf<String>()
        set.add("JAN")
        set.add("FEB")
        set.add("MAR")
        set.add("JAN")// 동일한 값은 입력되지 않는다.

        // 2. 전체 데이터 출력해보기기
        Log.d("Collection", "Set 전체 출력 = ${set}")

        // 3. 특정 값 삭제하기
        set.remove("FEB")
        Log.d("Collection", "set 전체 출력 = ${set}")

        // 1. 맵 생성하기
        var map = mutableMapOf<String, String>()
        // 2. 값 넣기
        map.put("키1", "값2")
        map.put("키2", "값2")
        map.put("키3", "값3")
        // 3. 값 사용하기
        var variable = map.get("키2")
        Log.d("Collection", "키2의 값은 ${variable}입니다.")
        // 4. 값 수정하기
        map.put("키2", "두 번째 값 수정")
        Log.d("Collection", "키2의 값은 ${map.get("키2")}입니다.")
        // 5. 값 삭제하기
        map.remove("키2")
        // 5.1 없는 값을 불러오면 null 값이 출력된다.
        Log.d("Collection", "키2의 값은 ${map.get("키2")}입니다.")
    }
}