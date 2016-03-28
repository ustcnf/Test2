=first
@fred = qw(eating rocks is wrong);
$fred = "right"; #我们将打印"this is right[3]”
print "this is $fred[3]\n"; #打印出"wrong”使用$fred[3]
print "this is ${fred}[3]\n"; #打印出"right”（由花括号分开）
print "this is $fred". "[3]\n"; #正确（两个字符串，右. 分开）
print "this is $fred\[3]\n"; #正确(利用反斜线转义)
=cut
=second
foreach $rock (qw/ bedrock slate lava /)
{
print "One rock is $rock.\n"; #打印出3 种rocks
}
=cut

=third
foreach $rocks(qw { bedrock slate lava }){
	$rock = "\t$rock"; #@rocks 的每一个元素前加入一个tab
	$rock .= "\n"; #每一个元素后加一个换行符
print "The rocks are:$rocks\n"; 
print "The rocks are:@rocks[1]\n"; #每一个元素都被缩进了，并且一个元素占一行
print "----------------\n";
}
=cut


=forth
foreach(1..10){ #使用默认的变量$_
print "I can count to $_!\n";
}

=cut

=test
$_ ="Yabba dabba doo\n";
print; #打印出默认变量$_。
=cut

=forth
@a = qw /aa bb cc/;
print "$a[0]"."\n";
@b = reverse (@a);
print "$a[0]"."\n";
print "$b[0]"."\n";
=cut

@rocks = qw(talc quartz jade obsidian);
print "How many rocks do you have?\n";
print "I have ", @rocks, "rocks!\n"; #错误，输出rocks 的名字
print "I have ", scalar @rocks, "rocks!\n";
