//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/mutable/ArrayBuffer.html#combinations(n:Int):Iterator[Repr]">scala.collection.SeqLike#combinations</a></li>
<li name="scala.collection.SeqLike#combinations" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="combinations(n:Int):Iterator[Repr]"></a><a id="combinations(Int):Iterator[ArrayBuffer[A]]"></a> <span class="permalink"> <a href="../../../scala/collection/mutable/ArrayBuffer.html#combinations(n:Int):Iterator[Repr]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">combinations</span><span class="params">(<span name="n">n: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="../Iterator.html" class="extype" name="scala.collection.Iterator">Iterator</a>[<a href="" class="extype" name="scala.collection.mutable.ArrayBuffer">ArrayBuffer</a>[<span class="extype" name="scala.collection.mutable.ArrayBuffer.A">A</span>]]</span> </span> <p class="shortcomment cmt">Iterates over combinations.</p>
 <div class="fullcomment">
  <div class="comment cmt">
   <p>Iterates over combinations. A _combination_ of length <code>n</code> is a subsequence of the original sequence, with the elements taken in order. Thus, <code>"xy"</code> and <code>"yy"</code> are both length-2 combinations of <code>"xyy"</code>, but <code>"yx"</code> is not. If there is more than one way to generate the same subsequence, only one will be returned.</p>
   <p> For example, <code>"xyyy"</code> has three different ways to generate <code>"xy"</code> depending on whether the first, second, or third <code>"y"</code> is selected. However, since all are identical, only one will be chosen. Which of the three will be taken is an implementation detail that is not defined. </p>
  </div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>An Iterator which traverses the possible n-element combinations of this sequence.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a>
   </dd>
   <div class="block">
    Example: 
    <ol>
     <li class="cmt"><p><code>"abbbc".combinations(2) = Iterator(ab, ac, bb, bc)</code></p></li>
    </ol> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples



