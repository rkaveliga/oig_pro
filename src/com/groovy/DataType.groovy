package com.groovy

def b=10
println b.getClass().getName()
Byte a=10
println a.getClass().getName()
println a.MAX_VALUE
println a.MIN_VALUE

def text
def output=text?:"Hi"
println output

assert output=="Hi"

assert output.minus('i')=='H'

class Person{
	String name
	
}
Person p
println p?.getName()
def sal
sal=2000
def tax=sal*0.10?:1000*0.10
println tax

def name="Raja"
println name.reverse()
def x=2/3
println x.getClass().getName()

def phone="999-898-789"
println phone.replace('-', '').toInteger()