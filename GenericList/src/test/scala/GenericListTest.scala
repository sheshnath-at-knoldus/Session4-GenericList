package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class GenericListTest extends AnyFunSuite {

  test("Generic List Test "){
    val instance = new GenericList
    val list = List(1, 2, 3, 4, 5, 6)
    val actualValue  = instance.getNthElement(list, 5)
    val expectedValue =2
    assert(actualValue==expectedValue)
  }

  test("Generic List Of String ") {
    val instance = new GenericList
    val list = List("My","Name", "Is", "Sheshnath","Yadav")
    val actualValue = instance.getNthElement(list, 3)
    val expectedValue = "Is"
    assert(actualValue == expectedValue)
  }

  test("Generic List Of Char ") {
    val instance = new GenericList
    val list = List('A', 'B','C','D','E')
    val actualValue = instance.getNthElement(list, 3)
    val expectedValue = 'C'
    assert(actualValue == expectedValue)
  }

}
