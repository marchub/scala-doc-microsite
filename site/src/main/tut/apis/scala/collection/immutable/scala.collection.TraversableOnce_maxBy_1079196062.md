//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#maxBy[B](f:A=>B):A">scala.collection.TraversableOnce#maxBy</a></li>
<li name="scala.collection.TraversableOnce#maxBy" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="maxBy[B](f:A=>B):A"></a><a id="maxBy[B]((A)⇒B):A"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#maxBy[B](f:A=>B):A" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">maxBy</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.GenTraversableOnce.A">A</span>) ⇒ <span class="extype" name="scala.collection.TraversableOnce.maxBy.B">B</span></span>)</span><span class="result">: <span class="extype" name="scala.collection.GenTraversableOnce.A">A</span></span> </span> <p class="shortcomment cmt">[use case] Finds the first element which yields the largest value measured by function f.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> Finds the first element which yields the largest value measured by function f.</p>
  </div>
  <dl class="paramcmts block">
   <dt class="tparam">
    B
   </dt>
   <dd class="cmt">
    <p>The result type of the function f.</p>
   </dd>
   <dt class="param">
    f
   </dt>
   <dd class="cmt">
    <p>The measuring function.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>the first element of this list with the largest value measured by function f.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="../TraversableOnce.html" class="extype" name="scala.collection.TraversableOnce">TraversableOnce</a> → 
    <a href="../GenTraversableOnce.html" class="extype" name="scala.collection.GenTraversableOnce">GenTraversableOnce</a>
   </dd>
   <div class="full-signature-block toggleContainer"> 
    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
    <div class="hiddenContent full-signature-usecase">
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">maxBy</span><span class="tparams">[<span name="B">B</span>]</span><span class="params">(<span name="f">f: (<span class="extype" name="scala.collection.immutable.List.A">A</span>) ⇒ <span class="extype" name="scala.collection.TraversableOnce.maxBy.B">B</span></span>)</span><span class="params">(<span class="implicit">implicit </span><span name="cmp">cmp: <a href="../../index.html#Ordering[T]=scala.math.Ordering[T]" class="extmbr" name="scala.Ordering">Ordering</a>[<span class="extype" name="scala.collection.TraversableOnce.maxBy.B">B</span>]</span>)</span><span class="result">: <span class="extype" name="scala.collection.immutable.List.A">A</span></span> </span> </h4>
    </div> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples





























