//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#+:(elem:A):List[A]">scala.collection.immutable.List#+:</a></li>
<li name="scala.collection.immutable.List#+:" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="+:(elem:A):List[A]"></a><a id="+:(A):List[A]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#+:(elem:A):List[A]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $plus$colon" class="name">+:</span><span class="params">(<span name="elem">elem: <span class="extype" name="scala.collection.GenSeqLike.A">A</span></span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.GenSeqLike.A">A</span>]</span> </span> <p class="shortcomment cmt">[use case] A copy of the list with an element prepended.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> A copy of the list with an element prepended.</p>
   <p> Note that :-ending operators are right associative (see example). A mnemonic for <code>+:</code> vs. <code>:+</code> is: the COLon goes on the COLlection side.</p>
   <p> Also, the original list is not modified, so you will want to capture the result.</p>
   <p> Example:</p>
   <pre>scala&gt; <span class="kw">val</span> x = <span class="std">List</span>(<span class="num">1</span>)
x: <span class="std">List</span>[<span class="std">Int</span>] = <span class="std">List</span>(<span class="num">1</span>)

scala&gt; <span class="kw">val</span> y = <span class="num">2</span> +: x
y: <span class="std">List</span>[<span class="std">Int</span>] = <span class="std">List</span>(<span class="num">2</span>, <span class="num">1</span>)

scala&gt; println(x)
<span class="std">List</span>(<span class="num">1</span>)</pre>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    elem
   </dt>
   <dd class="cmt">
    <p>the prepended element</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a new list consisting of <code>elem</code> followed by all elements of this list.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="" class="extype" name="scala.collection.immutable.List">List</a> → 
    <a href="../SeqLike.html" class="extype" name="scala.collection.SeqLike">SeqLike</a> → 
    <a href="../GenSeqLike.html" class="extype" name="scala.collection.GenSeqLike">GenSeqLike</a>
   </dd>
   <div class="full-signature-block toggleContainer"> 
    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
    <div class="hiddenContent full-signature-usecase">
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $plus$colon" class="name">+:</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>, <span name="That">That</span>]</span><span class="params">(<span name="elem">elem: <span class="extype" name="scala.collection.immutable.List.+:.B">B</span></span>)</span><span class="params">(<span class="implicit">implicit </span><span name="bf">bf: <a href="../generic/CanBuildFrom.html" class="extype" name="scala.collection.generic.CanBuildFrom">CanBuildFrom</a>[<a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>], <span class="extype" name="scala.collection.immutable.List.+:.B">B</span>, <span class="extype" name="scala.collection.immutable.List.+:.That">That</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.immutable.List.+:.That">That</span></span> </span> </h4>
    </div> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples



