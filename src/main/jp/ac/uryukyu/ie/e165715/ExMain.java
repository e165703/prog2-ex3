package jp.ac.uryukyu.ie.e165715;

import java.io.File; // ファイルやディレクトリの抽象表現
import java.io.FileNotFoundException; // 例外
import java.util.ArrayList; // Listの実装
import java.util.List; // いわゆる「リスト構造」のインターフェース（実装のないクラス。教科書19章）
import java.util.Scanner; // 標準入力読み込みの際に利用したクラス

/**
 * Created by e165715 on 2016/11/22.
 */
public class ExMain {
    public static void main(String[] args) {
        /* ファイルのパスは、プロジェクトのトップディレクトリを基準とした相対パスで記述。
            .javaファイルを置いてるディレクトリ基準ではないことに注意。 */
        String filename = "./src/main/jp/ac/uryukyu/ie/e165715/map.txt";
        List<String> strings = new ArrayList<>(); // ファイルから読み込んだ文字列を保存するためのリスト。
        Scanner scanner;

        System.out.println("\n\n行番号付けてみる");
        for(int i=0; i<strings.size(); i++){
            System.out.printf("%d行目: %s\n", i, strings.get(i));
        }
    }



}
