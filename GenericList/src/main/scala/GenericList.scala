package com.knoldus

class GenericList {

//getNthElement method

  def getNthElement[A](genericList: List[A], nthNumber: Int): A = {
    if (nthNumber > genericList.length) throw new IndexOutOfBoundsException()
    val result = genericList.reverse(nthNumber - 1)
    result
  }

}
