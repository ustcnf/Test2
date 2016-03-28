#! perl –w
$what ="rontosaurus steak";
$n = 3;
print "fred ate $n $whats.\n"; #不是steaks，而是$whats 的值
print "fred ate $n ${what}s.\n"; #现在是使用变量$what
print "fred ate $n $what". "s.\n"; #另一种方法
print 'fred ate '. $n . ' '. $what . "s.\n"; #一种复杂的方法
