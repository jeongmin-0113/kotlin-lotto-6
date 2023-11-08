package lotto

object Error {
    const val MESSAGE_HEADER = "[ERROR] "
    const val LOTTO_NUMBER_SIZE_IS_NOT_SIX = "로또 번호는 6개의 정수여야 합니다."
    const val LOTTO_NUMBER_TYPE_IS_NOT_INT = "로또 번호의 타입은 정수여야 합니다."
    const val LOTTO_NUMBER_IS_OUT_OF_RANGE = "로또 번호는 1~45사이의 정수여야 합니다."
    const val LOTTO_NUMBER_CANT_DUPLICATE = "로또 번호는 중복될 수 없습니다."

    fun printErrorMessage(msg: String) {
        println(MESSAGE_HEADER + msg)
    }
}