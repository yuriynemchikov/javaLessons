package Task7;

public class Ferzi {

    private final int size = 8; // размер шахматной доски
    private int [] location; // позиция ферзя в каждом ряду шахматной доски
    private int [] colsOccupied; // Столбец, занятый ферзь на шахматной доске
    private int [] cross1Occuptied; // Положительная диагональная линия, занятая ферзем на доске
    private int [] cross2Occuptied; // Королева занимает противоположный угол на шахматной доске
    private static int count; // Количество решений

    private static final int statusOccupied = 1; // занятый статус
    private static final int statusOccupyCanceled = 0; // незанятый статус

    public Ferzi() {

        this.location = new int[this.size];
        this.colsOccupied = new int[this.size];
        this.cross1Occuptied = new int[2*this.size];
        this.cross2Occuptied = new int[2*this.size];
    }

    public void printLocation() {

        System.out.println ("Вариант №" + count + " размещения ферзей на шахматной доске");
        for (int i=0; i <this.size; i++) {

            System.out.println ("строка:" + (i+1) + " столбец:" + (this.location [i] + 1));
        }
    }

	 // Определить, занято ли место (i, j)
    private boolean isOccupied(int i, int j) {

        if(this.colsOccupied[j] == 1) {
            return true ;
        }

        if(this.cross1Occuptied[i-j+this.size-1] == 1) {
            return true ;
        }

        if (this.cross2Occuptied[i+j] == 1) {
            return true ;
        }

        return false ;
    }

    /**
     * Если флаг равен 1, это означает, что место занимает (i, j);
     * Если флаг равен 0, это означает отменить занятие места (i, j);
     */

    private void setStatus(int i, int j, int flag){

        this.colsOccupied [j] = flag; // Объявляем занятие или отменяем занятие столбца j
        this.cross1Occuptied [i-j + this.size-1] = flag; // Объявляем занятие или отменяем занятие диагонали
        this.cross2Occuptied [i + j] = flag; // объявляем оккупацию или отменяем оккупацию оппозиционного угла


    }

	 // Ферзь ставится на первую строку
    public void place(int i) {

        for (int j = 0; j <this.size; j ++) {// Попытка поместить ферзь в каждый столбец i-й строки

            if (! this.isOccupied (i, j)) {// Определить, занято ли место

                this.location [i] = j; // поместить ферзя в j-й столбец в i-й строке
                this.setStatus (i, j, this.statusOccupied); // Занят

                if (i < this.size-1) {
                    this.place(i+1) ;

                }else {
                    this.count++ ;
                    this.printLocation() ;
                }
                // Откат
                this.setStatus(i, j, statusOccupyCanceled) ;

            }

        }

    }

    public void start() {

        this.place(0) ;
    }

}