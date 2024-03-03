# Wiener Deconvolution

Wiener deconvolution is a widely used algorithm in image processing for restoring images that have been degraded by a linear process, such as blurring or convolution with a known or unknown kernel, and possibly contaminated by noise. The algorithm is based on the assumption that the degradation process can be modeled as linear convolution with some unknown kernel, along with additive noise.

The basic idea behind Wiener deconvolution is to estimate the original, undegraded image by applying a deconvolution filter to the degraded image. This filter is designed to minimize the mean square error between the estimated image and the original image, taking into account both the degradation process and the noise.

The Wiener deconvolution filter is defined in the frequency domain as follows:

\[ H(u, v) = \frac{{G(u, v) \cdot H^*(u, v)}}{{|H(u, v)|^2 + \frac{{S_n(u, v)}}{{S_f(u, v)}}}} \]

Where:
- \( H(u, v) \) is the frequency domain representation of the degradation kernel (point spread function).
- \( G(u, v) \) is the frequency domain representation of the degraded image.
- \( H^*(u, v) \) is the complex conjugate of \( H(u, v) \).
- \( S_n(u, v) \) is the power spectral density of the noise.
- \( S_f(u, v) \) is the power spectral density of the undegraded image.

In practice, the Wiener filter can be applied in the spatial domain by taking the inverse Fourier transform of \( H(u, v) \) to obtain the spatial domain filter, which is then convolved with the degraded image to obtain the estimated undegraded image.

Wiener deconvolution is effective for restoring images degraded by blur and noise, but it requires knowledge or estimation of the degradation kernel and noise characteristics, which can be challenging in practice. Various techniques exist for estimating the degradation kernel and noise parameters, such as blind deconvolution methods and regularization techniques.

It's worth noting that while Wiener deconvolution can improve the quality of degraded images, it cannot completely recover lost information or correct for severe degradation. Additionally, it may amplify noise in regions of low signal-to-noise ratio. Therefore, careful parameter selection and evaluation are important for obtaining satisfactory results.
