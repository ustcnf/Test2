=code1
chomp($area = <STDIN>);
if($area < 0)
{
	print 0;
}
else
{
print $area * (2 * 3.1415926);
}
=cut

=code4
chomp($m = <STDIN>);
chomp($n = <STDIN>);
print $m * $n;
=cut


=Test reverse
chomp($str = <STDIN>);
chomp($num = <STDIN>);
print "$str\n" x $num;
=cut

