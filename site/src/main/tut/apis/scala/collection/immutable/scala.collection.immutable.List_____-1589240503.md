//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#:::(prefix:List[A]):List[A]">scala.collection.immutable.List#:::</a></li>
<li name="scala.collection.immutable.List#:::" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id=":::(prefix:List[A]):List[A]"></a><a id=":::(List[A]):List[A]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#:::(prefix:List[A]):List[A]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $colon$colon$colon" class="name">:::</span><span class="params">(<span name="prefix">prefix: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]</span> </span> <p class="shortcomment cmt">[use case] Adds the elements of a given list in front of this list.</p>
 <div class="fullcomment">
  [use case] 
  <div class="comment cmt">
   <p> Adds the elements of a given list in front of this list.</p>
   <p> Example:</p>
   <pre><span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>) ::: <span class="std">List</span>(<span class="num">3</span>, <span class="num">4</span>) = <span class="std">List</span>(<span class="num">3</span>, <span class="num">4</span>).:::(<span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>)) = <span class="std">List</span>(<span class="num">1</span>, <span class="num">2</span>, <span class="num">3</span>, <span class="num">4</span>)</pre>
  </div>
  <dl class="paramcmts block">
   <dt class="param">
    prefix
   </dt>
   <dd class="cmt">
    <p>The list elements to prepend.</p>
   </dd>
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a list resulting from the concatenation of the given list <code>prefix</code> and this list.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <div class="full-signature-block toggleContainer"> 
    <span class="toggle"> <i class="material-icons"></i> Full Signature </span> 
    <div class="hiddenContent full-signature-usecase">
     <h4 id="signature" class="signature"> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span title="gt4s: $colon$colon$colon" class="name">:::</span><span class="tparams">[<span name="B">B &gt;: <span class="extype" name="scala.collection.immutable.List.A">A</span></span>]</span><span class="params">(<span name="prefix">prefix: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.:::.B">B</span>]</span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.:::.B">B</span>]</span> </span> </h4>
    </div> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples



























