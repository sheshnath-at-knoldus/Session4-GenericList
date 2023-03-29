package com.knoldus

import scala.util.{Failure, Success, Try}

//main
object Driver extends App {

  private val instance = new GenericList
  private val list = List(1, 2, 3, 4, 5, 6)
  val result = Try(instance.getNthElement(list, 3))

  result match {
    case Success(result) => println(result)
    case Failure(exception) => println(exception.getMessage)//exceptions can be catch
  }

}
