package com.groovy
def log=''
(1..10).each { log+= it }
println log
assert log=='12345678910'

Map map = ['a':1, 'b':2]
map.each{ key, value -> map[key] = value * 2 } //#1 Parameter sequence with commas
assert map == ['a':2, 'b':4]
print map

Closure doubler = {key, value -> map[key] = value * 2 } //#2 Assign and then call
map.each(doubler) //#2 a closure reference
assert map == ['a':4, 'b':8]
print map
def doubleMethod (entry){ //|#3 A usual method
 entry.value = entry.value * 2 //|#3 declaration
}
doubler = this.&doubleMethod //#4 Reference and call
map.each(doubler) //#4 a method as a closure
print map
assert map == ['a':8, 'b':16]
File f=new File("capitals.txt")
def clist=[]
f.each{line->clist.add(line)}
println clist

def dict=[:]
def key,value
clist.each{list->token=list.tokenize(",")
key=token[0].trim()
value=token[1].trim()
dict[key]=value
}
def candc={String s->
	def cc=[:]
	dict.each{k,v->if(k.startsWith(s))
	cc[k]=v
	}
	cc
	}
	print candc("I")