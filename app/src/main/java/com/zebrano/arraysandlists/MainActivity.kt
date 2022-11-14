package com.zebrano.arraysandlists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zebrano.arraysandlists.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var vb : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)

        // ARRAYS
        // Неявное создание массива
        val nums = arrayOf(1,2,3,4,5,6)
        //Log.d("AppLog", "nums[3] = ${nums[3]}")
        // Изменение элементов
        nums[3] = 123
        //Log.d("AppLog", "nums[3] = ${nums[3]}")
        val arrNull = arrayOfNulls<Int>(10)
        arrNull[4] = 4

        val arr = arrayOf(9,3,5,1)
        val isContain = arr.contains(5)
        //Log.d("AppLog", "arr contains 5 = $isContain")

        //Создаем массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        var arrayOrigin = arrayOf(9, 3, 5, 1, 0, 67, 11)
        //Проверяем наибольшее число в массиве.
        val maxNumber = arrayOrigin.maxOrNull()
        //Проверяем наименьшее число в массиве.
        val minNumber = arrayOrigin.minOrNull()
        //Log.d("AppLog", "max = $maxNumber, min = $minNumber")

        arrayOrigin = arrayOf(9, 3, 5)
        val sum = arrayOrigin.sum()
        //Log.d("AppLog", "sum = $sum")

        //Создаем массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        arrayOrigin = arrayOf(9, 3, 5)
        //Находим среднее значение в массиве
        val average = arrayOrigin.average()
        //Log.d("AppLog", "average val = $average")

        //Создаем ервый массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        arrayOrigin = arrayOf(9, 3, 5, 1, 0, 67, 11)
        //Создаем второй массив с 7-ю ячейками: (9, 3, 5, 1, 0, 67, 11)
        val arrayOrigin2 = arrayOf(1, 34, 7, 45, 56, 675, 3)
        //Находим общие элементы, в данном случае это 3 и 1 и создаем новый массив
        //в который записываем общие значения для двух массивов
        //Нам выдает класс Set по этому мы превращаем результат
        //с помощью toIntArray() в массив с типом данных Int
        val resultArray = arrayOrigin.intersect(arrayOrigin2.toList()).toIntArray()
        //Log.d("AppLog", "resultArray size: ${resultArray.size}")

        arrayOrigin = arrayOf(1,2,3,4,5,6)
        // operation
        arrayOrigin.shuffle()

        // LISTS
        val list = listOf(1,2,3,7)

//        for (index in 0..list.size){
//            Log.d("AppLog",list[index].toString())
//        }

//        for (element in list) {
//            Log.d("AppLog",element.toString())
//        }

//        for ((index, item) in list.withIndex())
//            Log.d("AppLog", "$index | $item")

        val arraylist = arrayOf(3,6,56,78,54,33,4,6,46,78,45,22,3)
        for (index in 10 downTo 0 step 2)
            Log.d("AppLog", "${arraylist[index]}")

        //Log.d("AppLog", arraylist.contentToString())





    }
}